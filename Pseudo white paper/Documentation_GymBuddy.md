Open this file with OBSIDIAN if you want to make an edit or make a new PDF from it
### User stories
1. As a customer, I want to access my old workout routines, so that I can see them when i want.(da fare)

2. As a ==pro athlete==(DA RIVEDERE), I want to be able to mark weights, sets and repetitions done in the gym, so that I can track my progress.(da fare)

3. As a personal trainer, I want to create new workout routines for my customers, so that I can personally manage their trainings.(da fare)

4. As a beginner customer, I want to be able to skip sets and exercises, so that I can finish my workout more easily.(da fare)

> [!Warning]
5. As a personal trainer, ==I want to make reports regarding the workouts== of each of my clients, so that I can manage easily their progresses.(da rivedere/togliere )

  6. As a pro athlete, I want to create my own routines, so that I can personally manage myself.(da fare)

7. As a personal trainer, i want to to be able to add notes to workout routines ,so that i can comunicate with my client.(da fare)

8.  As a gym owner, i want to be able to send communications to all my costumers, so that i can inform them about important news.(da fare)

9. As a  ==pro athlete==(DA RIVEDERE), i want to see my training data (weight progess, frequency of training, weight lost, muscle gaines) in my personal page, so that i can track how my training is going.


### Functional requirements 
1. The `system` shall  be able to make a weekly `workout report`$^{(1)}$ .
2. The `system` shall allow to add a note when assigning a `workout routine`$^{(2)}$.
3. The `system` shall allow the creation of new `access credentials` $^{(3)}$ for new `users` and `trainers` and send them ==via email==(da vedere.
4. The `system` shall store all the `users’` `workout routines`.
5. The `system` shall provide the creation of new `workout routines`.
6. The `system` shall allow to mark as `skipped`$^{(4)}$ exercises or sets of a workout session.


> [!Note] Dictionary
> 1.  ==Workout report== : Using the data from workout routines such reps done for an exercise,weights used, skipped$^{(4)}$ exercise,workouts done during the week, time spent exercising, ecc (==da aggiungere o togliere elementi cambiati per la docuemntazione finale==)
> 2. ==Workout routine==: Its composed by a variable number of exercises and each one of them has a variable number of reps to be done, each exercise needs to have a weight target to use.
> 3. ==Access credentials== : we have different types of credentials, one for the receptions that is created by signing up to the service has a gym, and we have a type for users of the gym and trainers that is created by the reception, the access system is the same for everyone but the interface changes for each level of user
> 4. ==Skipped==: You can register a exercise/training/rep as skipped for whatever reason, this is useful when you want to keep track of what you have to recover/focus and to keep the trainer informed on how your training is going.


